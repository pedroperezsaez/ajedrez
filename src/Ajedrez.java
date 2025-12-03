import java.util.Arrays;

public class Ajedrez {
    static  final String asciiChess= "                 _        _        _        __       __       _\n" +
            "        /\\       |_)      /        | \\      |_       |_       /        |_|\n" +
            "       /--\\      |_)      \\_       |_/      |__      |        \\_?      | |\n" +
            "\n" +
            "  _           #########         #########         #########         #########\n" +
            " (_)   [`'`'] ##\\`.'/##  ':v:`  ##/\\:/\\##  |:+:|  ##':v:`##  \\`.'/  ##[`'`']#\n" +
            " (_)    |::|  ##(o:o)##  (o:0)  #/(o:o)\\#  (o:o)  ##(o:0)##  (o:o)  ###|::|##\n" +
            "        |::|  ###\\:/:\\#   (:)   ###(:)###   (:)   ###(:)###   \\:/:\\ ###|::|##\n" +
            "              ####\"####         #########         #########    \"    #########\n" +
            "  __ #########         #########         #########         #########     \n" +
            "   / ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|\n" +
            "  /  ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|\n" +
            "     ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|   ###|:|###   |:|\n" +
            "     #########         #########         #########         #########\n" +
            "              #########         #########         #########         #########\n" +
            "  /           #########         #########         #########         #########\n" +
            " (_)          #########         #########         #########         #########\n" +
            "              #########         #########         #########         #########\n" +
            "              #########         #########         #########         #########\n" +
            "  _  #########         #########         #########         #########\n" +
            " |_  #########         #########         #########         #########\n" +
            "  _) #########         #########         #########         #########\n" +
            "     #########         #########         #########         #########\n" +
            "     #########         #########         #########         #########\n" +
            "   .          #########         #########         #########         #########\n" +
            "  /|          #########         #########         #########         #########\n" +
            " '-|          #########         #########         #########         #########\n" +
            "              #########         #########         #########         #########\n" +
            "              #########         #########         #########         #########\n" +
            "  _  #########         #########         #########         #########\n" +
            "  _) #########         #########         #########         #########\n" +
            "  _) #########         #########         #########         #########\n" +
            "     #########         #########         #########         #########\n" +
            "     #########         #########         #########         #########\n" +
            "  _      _    #########    _    #########    _    #########    _    #########\n" +
            "   )    | |   ###| |###   | |   ###| |###   | |   ###| |###   | |   ###| |###\n" +
            "  /_    | |   ###| |###   | |   ###| |###   | |   ###| |###   | |   ###| |###\n" +
            "        |_|   ###| |###   |_|   ###| |###   |_|   ###| |###   |_|   ###| |###\n" +
            "              #########         #########         #########         #########\n" +
            "     #########         #########   ___   #########         #########\n" +
            "  /| ##[`'`']#  \\`~'/  ##'\\v/`##  /\\*/\\  ##|`+'|##  '\\v/`  ##\\`~'/##  [`'`']\n" +
            "   | ###|  |##  (o o)  ##(o 0)## /(o o)\\ ##(o o)##  (o 0)  ##(o o)##   |  |\n" +
            "     ###|__|##   \\ / \\ ###(_)###   (_)   ###(_)###   (_)   ###\\ / \\#   |__|\n" +
            "     #########    \"    #########         #########         ####\"####";
    public static void main(String[] args) {

        String[] lines=asciiChess.split("\n");
        System.out.println(lines[0]);System.out.println(lines[1]);System.out.println(lines[2]);

        final int TORRE = 0;
        final int CAVALL= 1;
        final int ALFIL = 2;
        final int REINA = 3;
        final int REI = 4;
        final int PEO = 5;


/*
for (int i = 0; i < 5; i++) {
            String s= lines[fila].substring(col,col+9);
            s= s.replaceAll("#"," ");

    torre[i]=s;


            col=col+9;
            fila++;
 }
        System.out.println(torre);
 */
        String[][] whitePieces = new String[6][6];
        String[][] blackPieces = new String[6][6];


    }
                //emplenar cada posicio de l'array anterior amb la ieza adequada:
            //torre, cavall, alfil, reina, rei, peo
                static String[] tableroNegro(String[] lines){
                    int fila=19;
                    int col=5;
                    String[] tableroNegro= new String[5];
                    for (int i = 0; i < 5; i++) {
                        tableroNegro[i]=lines[fila].substring(col, col+9);
                        fila++;
                        System.out.println(tableroNegro[i]);
                    } return  tableroNegro;


                }
    static String[] tableroBlanco(String[] lines){
        int fila=14;
        int col=5;
        String[] tableroBlanco= new String[5];
        for (int i = 0; i < 5; i++) {
            tableroBlanco[i]=lines[fila].substring(col, col+9);
            fila++;

        } return  tableroBlanco;


    }

static  void tablero(String[] lines){
    String[] blanco = tableroBlanco(lines);
    String[] negro  = tableroNegro(lines);

        String[][] tablero= new String[7][7];
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j <7 ; j++) {

        }
    }


}

static void fichasBlancas(String[][] whitePieces, String[] lines){
    int fila=4;
    int filaPeon=9;
    int col=5;

    for (int i = 0; i < 5; i++) {
        whitePieces[5][i]=lines[filaPeon+i].substring(col,col+9).replaceAll("#"," ");
    }

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            whitePieces[i][j] = lines[fila+j ].substring(col, col + 9).replaceAll("#"," ");
        }
        col += 9;
    }


}
static void fichasNegras(String[][] blackPieces, String[] lines){
    int fila=38;
    int filaPeon=34;
    int col=5;
    for (int i = 0; i < 5; i++) {
        blackPieces[5][i]=lines[filaPeon+i].substring(col,col+9).replaceAll("#"," ");


    }

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 6; j++) {
            blackPieces[i][j] = lines[fila+j ].substring(col, col + 9).replaceAll("#"," ");

        }
        col += 9;
    }

}





}