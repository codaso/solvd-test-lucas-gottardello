package com.lucas.solvd.homework2;

public class Streams {
    //information class
    public int a = 1;
    private int b = 2;

    public void streamMethod() {
        int c = a + b;
    }
    /*
    Collection<String> collection = Arrays.asList("a", "b", "c");
    Stream<String> streamOfCollection = collection.stream();

    //An array can also be the source of a stream:
    Stream<String> streamOfArray = Stream.of("a", "b", "c");

    //We can also create a stream out of an existing array or of part of an array:
    String[] arr = new String[]{"a", "b", "c"};
    Stream<String> streamOfArrayFull = Arrays.stream(arr);
    Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

    //When builder is used, the desired type should be additionally
    // specified in the right part of the statement,
    // otherwise the build() method will create an instance of the Stream<Object>:
    Stream<String> streamBuilder =
            Stream.<String>builder().add("a").add("b").add("c").build();

    //The generate() method accepts a Supplier<T> for element generation.
    // As the resulting stream is infinite,
    // the developer should specify the desired size, or the generate() method
    // will work until it reaches the memory limit:
    Stream<String> streamGenerated =
            Stream.generate(() -> "element").limit(10);
    //The code above creates a sequence of ten strings with the value “element.”

    //Another way of creating an infinite stream is by using the iterate() method:
    Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
    //The first element of the resulting stream is the first parameter of the iterate() method.
    // When creating every following element, the specified function is applied to
    // the previous element. In the example above the second element will be 42.

    //As Stream<T> is a generic interface, and there is no way to use primitives as a
    // type parameter with generics, three new special interfaces were created:
    // IntStream, LongStream, DoubleStream.
    IntStream intStream = IntStream.range(1, 3);
    LongStream longStream = LongStream.rangeClosed(1, 3);
    //range(int startInclusive, int endExclusive)
    //rangeClosed(int startInclusive, int endInclusive)

    //We can also use String as a source for creating a stream with the help of the chars()
    // method of the String class. Since there is no interface for CharStream in JDK,
    // we use the IntStream to represent a stream of chars instead.
    IntStream streamOfChars = "abc".chars();
    //The following example breaks a String into sub-strings according to specified RegEx:
    Stream<String> streamOfString =
            Pattern.compile(", ").splitAsStream("a, b, c");

    //Furthermore, Java NIO class Files allows us to generate a Stream<String>
    // of a text file through the lines() method.
    // Every line of the text becomes an element of the stream:
    public Streams() throws IOException {
        Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset =
                Files.lines(path, Charset.forName("UTF-8"));
    }

    @Override
    public String toString() {
        return "Streams";
    }

     */
}
