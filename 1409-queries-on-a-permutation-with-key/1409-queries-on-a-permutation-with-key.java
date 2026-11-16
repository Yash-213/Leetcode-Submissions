class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int[] answer = new int[n];
        // Java 8 : Add element in List from 1 to m
        List<Integer> listP = IntStream.rangeClosed(1, m)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
                
        for (int i = 0; i < n; i++) {
            //Search postion of element in listP
            int position = searchPosition(listP, queries[i]);
            answer[i] = position; // add element in answer Array

            // remove element and add in first Position
            int removedElement = listP.remove(position);
            listP.add(0, removedElement);
        }
        return answer;
    }

    int searchPosition(List<Integer> listP, int element) {
        //Linear Search to find out position of element in listP
        for (int i = 0; i < listP.size(); i++)
            if (listP.get(i) == element)
                return i;
        return -1; // unwanted but needed
    }
}