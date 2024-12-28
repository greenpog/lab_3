package lab3.sort;

public class LabSorter {

    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] source) {
        int len = source.length;
        for (int i=1; i<len; i++){
            for(int j=1; j<=len-i; j++){
                if (source[j-1]>source[j]){
                    int swap =source[j];
                    source[j]=source[j-1];
                    source[j-1]=swap;
                }
            }
        }
        return source;
    }
}
