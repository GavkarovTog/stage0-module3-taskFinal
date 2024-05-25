package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder builder = new StringBuilder(number + "");
        builder.reverse();

        System.out.println(builder);
    }
}
