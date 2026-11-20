
class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {

        int n = orders.size();

        List<List<String>> list = new ArrayList<>();
        List<String> header = new ArrayList<>();

        header.add("Table");

        // Collect unique food items
        for (int i = 0; i < n; i++) {
            String food = orders.get(i).get(2);

            if (!header.contains(food)) {
                header.add(food);
            }
        }

        // Sort food names alphabetically
        Collections.sort(header.subList(1, header.size()));

        list.add(header);

        // Store already processed tables
        Set<String> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String tableNo = orders.get(i).get(1);

            if (visited.contains(tableNo)) {
                continue;
            }

            visited.add(tableNo);

            List<String> order = new ArrayList<>(
                Collections.nCopies(header.size(), "0")
            );

            order.set(0, tableNo);

            // Count food orders for this table
            for (int j = 0; j < n; j++) {

                if (tableNo.equals(orders.get(j).get(1))) {

                    int idx = header.indexOf(orders.get(j).get(2));

                    int count = Integer.parseInt(order.get(idx));

                    count++;

                    order.set(idx, String.valueOf(count));
                }
            }

            list.add(order);
        }

        // Sort rows by table number
        list.subList(1, list.size()).sort(
            (a, b) -> Integer.compare(
                Integer.parseInt(a.get(0)),
                Integer.parseInt(b.get(0))
            )
        );

        return list;
    }
}
