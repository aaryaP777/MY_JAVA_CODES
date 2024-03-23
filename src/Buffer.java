public class Buffer {
    private StringBuffer buffer;

    public Buffer(String initialContent) {
        this.buffer = new StringBuffer(initialContent);
    }

    public String copy(int start, int end) {
        return buffer.substring(start, end);
    }

    public String cut(int start, int end) {
        String cutString = buffer.substring(start, end);
        buffer.delete(start, end);
        return cutString;
    }

    public void paste(int position, String str) {
        buffer.insert(position, str);
    }

    public void display() {
        System.out.println(buffer.toString());
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer("Hello World");

        System.out.println("Original buffer content:");
        buffer.display();

        String copiedText = buffer.copy(6, 11);
        System.out.println("Copied text: '" + copiedText + "'");

        String cutText = buffer.cut(0, 5); // Cut "Hello"
        System.out.println("Buffer after cutting 'Hello':");
        buffer.display();

        buffer.paste(buffer.buffer.length(), " " + cutText.trim());
        System.out.println("Buffer after pasting 'Hello' at the end:");
        buffer.display();
    }
}
