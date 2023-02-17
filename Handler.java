public interface Handler {
    public void setHandler(Handler nextHandler);

    public void process(File file);
    public String getName();
}
