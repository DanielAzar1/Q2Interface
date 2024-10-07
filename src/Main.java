public class Main {
    public static void main(String[] args) {
        Playable[] list = new Playable[3];

        list[0] = new Drums();
        list[1] = new Piano();
        list[2] = new Guitar();

        for(Playable tool: list)
        {
            tool.play();
        }
    }
}