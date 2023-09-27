public class Stack {

  private final Object[] buf;
  private int position;

  public Stack(int size) {
    buf = new Object[size];
  }

  public void push(Object o) {
    if (position > buf.length - 1) throw new OutOfMemoryError();
    buf[position++] = o;
  }

  public Object pop() {
    if (position <= 0) return null;
    return buf[--position];
  }

  public boolean isEmpty() {
    return (position == 0);
  }

  public boolean equals(Stack o) {
    return (buf == o.buf);
  }
}
