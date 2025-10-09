public class a26_stringbufferstringbuilder {
    public static void main(String[] a){
    StringBuffer sb = new StringBuffer("Vansh");
    sb.append(" Shah");
    System.out.println(sb);
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    String str = sb.toString();
    System.out.println(str);

    sb.deleteCharAt(5);
    System.out.println(sb);

    sb.insert(5," ");
    System.out.println(sb);

    sb.ensureCapacity(100);
	System.out.println(sb);
    }
}
