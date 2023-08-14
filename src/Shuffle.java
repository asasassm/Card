public interface Shuffle<E extends Card> {
    
    public void mix(E card);
    public E getCard();
    public String toString();
}
