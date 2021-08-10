import projetofinal.Gafanhoto;
import projetofinal.Pessoa;
import projetofinal.Video;
import projetofinal.Visualizacao;

public class main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 01 de POO");
        videos[1] = new Video("Aula 03 de PHP");
        videos[2] = new Video("Aula 05 de HTML");

        Gafanhoto[] gafanhotos = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Will", 25, "M", "willonf", 10);
        gafanhotos[1] = new Gafanhoto("Naty", 24, "F", "nathsidou", 15);

        Visualizacao vis = new Visualizacao(gafanhotos[0], videos[2]);

        System.out.println(videos[0].toString());
        System.out.println(gafanhotos[0].toString());
        System.out.println(vis.toString());
    }
}
