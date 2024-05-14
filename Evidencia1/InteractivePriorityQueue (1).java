
package interactivepriorityqueue;
import java.util.Scanner;

public class InteractivePriorityQueue {
    private static final int BATCH_SIZE = 6;

    private Object[] queueArray;
    private int size;

    public InteractivePriorityQueue() {
        this.queueArray = new Object[BATCH_SIZE];
        this.size = 0;
    }

        public void insert(Client client, Product product) {
        if (isFull()) {
            processBatch();
        }

        if (isEmpty() || size % BATCH_SIZE == 0) {
            if (size < queueArray.length) {
                queueArray[size++] = new Object[]{client, product};
            } else {
                processBatch();
                queueArray[size++] = new Object[]{client, product};
            }
        } else {
            Object[] newClientProductPair = new Object[]{client, product};
            int i;
            for (i = size - 1; i >= 0; i--) {
                Object[] existingPair = (Object[]) queueArray[i];
                if (comparePriority(newClientProductPair, existingPair) > 0) {
                    queueArray[i + 1] = existingPair;
                } else {
                    break;
                }
            }

                if (i + 1 < queueArray.length) {
                System.arraycopy(queueArray, i + 1, queueArray, i + 2, size - i - 1);
                queueArray[i + 1] = newClientProductPair;
                size++;
            } else {
                processBatch();
                queueArray[size++] = new Object[]{client, product};
            }
        }
    }


    private void processBatch() {
    if (!isEmpty()) {
        System.out.println("\nProcessing batch:");
        printQueue();
    }
    // Reset the queueArray and size for a new batch
    queueArray = new Object[BATCH_SIZE];
    size = 0;
}

    private int comparePriority(Object[] pair1, Object[] pair2) {
        Client client1 = (Client) pair1[0];
        Client client2 = (Client) pair2[0];
        Product product1 = (Product) pair1[1];
        Product product2 = (Product) pair2[1];

        // Special case: "urgent orders" always have the highest priority
        if ("urgent orders".equals(product1.getType())) {
            return 1; // Higher priority
        } else if ("urgent orders".equals(product2.getType())) {
            return -1; // Lower priority
        }

        // Compare based on product priority
        int productPriority = compareProductPriority(product1.getType(), product2.getType());
        if (productPriority != 0) {
            return productPriority;
        }

        // If products have the same priority, compare based on membership priority
        int membershipPriority = compareMembershipPriority(client1.getMembership(), client2.getMembership());
        return membershipPriority;
    }

    private int compareProductPriority(String product1, String product2) {
        // Define the priority order for products
        String[] priorityOrder = {"urgent orders", "perishable", "luxury goods", "electronics"};

        int index1 = getIndex(product1, priorityOrder);
        int index2 = getIndex(product2, priorityOrder);

        return Integer.compare(index2, index1); // Higher index means higher priority
    }

    private int compareMembershipPriority(String membership1, String membership2) {
        // Define the priority order for memberships
        String[] priorityOrder = {"premium", "normal"};

        int index1 = getIndex(membership1, priorityOrder);
        int index2 = getIndex(membership2, priorityOrder);

        return Integer.compare(index2, index1); // Higher index means higher priority
    }

    private int getIndex(String value, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                return i;
            }
        }
        return -1; // Value not found in the array
    }

    public void printQueue() {
        for (Object obj : queueArray) {
            if (obj != null) {
                Object[] pair = (Object[]) obj;
                Client client = (Client) pair[0];
                Product product = (Product) pair[1];
                System.out.println("Client ID: " + client.getId() + ", Membership: " + client.getMembership() +
                        ", Product Type: " + product.getType());
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == BATCH_SIZE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InteractivePriorityQueue priorityQueue = new InteractivePriorityQueue();

        int clientCount = 0;

        while (true) {
            System.out.println("\nEntering data for Client " + (++clientCount) + ":");

            String membership;
            do {
                System.out.print("Enter membership type (normal/premium): ");
                membership = scanner.nextLine().toLowerCase();
            } while (!membership.equals("normal") && !membership.equals("premium"));

            String productType;
            do {
                System.out.print("Enter product type (urgent orders/perishable/luxury goods/electronics): ");
                productType = scanner.nextLine().toLowerCase();
            } while (!productType.equals("urgent orders") && !productType.equals("perishable") &&
                    !productType.equals("luxury goods") && !productType.equals("electronics"));

            Client client = new Client(clientCount, membership);
            Product product = new Product(productType);

            priorityQueue.insert(client, product);

            if (priorityQueue.isFull()) {
                priorityQueue.processBatch();
            }

            System.out.print("Do you want to add another client? (yes/no): ");
            String addAnother = scanner.nextLine().toLowerCase();
            if (!addAnother.equals("yes")) {
                priorityQueue.processBatch();
                break; // Exit the loop if the user doesn't want to add another client
            }
        }

        scanner.close();
    }
}