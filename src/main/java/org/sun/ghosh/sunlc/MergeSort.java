
import static java.io.IO.print;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;


void main(){
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;

    int[] merged = IntStream.concat(
                    Arrays.stream(nums1, 0, m), 
                    Arrays.stream(nums2))
                   .sorted().toArray();
    // Arrays.stream(merged).forEach(i -> print(i));

    Arrays.parallelSort(nums2);
    Arrays.sort(nums2);

    // Arrays.stream(nums2).forEach(i -> print(i));
    var list = Arrays.asList("Jan", "Feb", "Mar");
    // Collections.sort(list);
    // list.stream().forEach(i -> print(i));
    // Collections.reverse(list);
    // list.stream().forEach(i -> print(i));
    Collections.rotate(list,1);
    list.stream().forEach(i -> print(i));
    Collections.shuffle(list);
    list.stream().forEach(i -> print(i));
}
