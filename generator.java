import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {

    private static JFrame frame;
    private static JButton sub;
    private static JTextField lenField;
    private static int width = 500;

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

    public static void createFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setLayout( null );
        frame.setVisible( true );
        frame.setResizable( false );
        frame.setSize( width, 400 );
    }

    public static void createButton( String name ) {
        sub = new JButton( name );
        sub.setBounds( ( width / 2 ) - 60, 300, 120, 50 );
        frame.add( sub );

        sub.addActionListener(e -> System.out.println( Main.gen( 8, "" ) ) );

    }
  
    public static void createInputLen() {
        lenField = new JTextField();
    }

    public static void main( String args[] ) {
        Main.createFrame();
        Main.createButton( "Generate" );
    }
}
