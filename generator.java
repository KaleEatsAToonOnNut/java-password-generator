class Main {

    public static String gen( int length, String whitelist ) {
      String charList = whitelist;
      String out = "";
      if( whitelist.equals( "" ) ) {
        charList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
      }
  
      for( int i = 0; i < length; i++ ) {
        out += charList.charAt( ( int ) ( Math.random() * charList.length() ) );
      }
  
      return out;

    }
  
    public static void main( String args[] ) {
      System.out.println( Main.gen( 8, "" ) );
    }
  }
