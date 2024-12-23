class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        if (rowIndex == 0) {
            return firstRow;
        }

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            row.add(1);
            result.add(row);
        }

        return result.get(rowIndex);
    }
}
