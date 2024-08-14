public class Condicionales {
    public static void main(String[] args){
        int matematicas = 5;
        int biologia = 3;
        int quimica = 6;
        int promedio = 0;

        promedio = (matematicas + quimica + biologia) / 3;
        if (promedio >= 6){
            System.out.println("El alumno aprobo: " + promedio);
        }else{
            System.out.println("El alumno reprobo: " + promedio);
        }
        
    }
}
