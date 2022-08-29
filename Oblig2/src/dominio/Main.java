// Santiago Chemello (251469)

package dominio;

import interfaz.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        MenuPrincipal menu = new MenuPrincipal(sistema);
        menu.setResizable(false);
        menu.setVisible(true);
    }
}
