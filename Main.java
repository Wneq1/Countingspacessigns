class Main {
  public static void main(String[] args) {

    String string =" Siema wariacie co tam u ciebie ?";
    System.out.println("String"+ string);

char findChar = ' ';
    int count =0; 
    
    for(int i =0; i<string.length();i++){
if(string.charAt(i)==findChar){
  count ++;
}      
    }
    System.out.println("Ilosc szukanej zmiennej "+ count);

  }
}