public class Main {
    public static void main (String [] args){

            DB.insertSQL("Insert into City values(2650,'Hvidovre');");
            DB.selectSQL("Select * from City");

            do{
                String data = DB.getDisplayData();
                if (data.equals(DB.NOMOREDATA)){
                    break;
                }else{
                    System.out.print(data);
                }
            } while(true);


            DB.deleteSQL("Delete from project where project_no like 'g%';");

            DB.selectSQL("Select project_name from project");

            System.out.println("numberOfColumns="+DB.getNumberOfColumns());
            do{
                String data = DB.getData();
                if (data.equals(DB.NOMOREDATA)){
                    break;
                }else{
                    System.out.print(data);
                }
            } while(true);

        }
}
