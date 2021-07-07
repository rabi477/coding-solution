import java.awt.*;
import java.awt.event.*;

class Frame1 extends WindowAdapter implements ActionListener{
    Frame f;
    TextField tf;
    Button bt1,bt2;
    Label heading,result,txtLabel;

    Frame1(){
        f=new Frame("Find Factorial");
        tf=new TextField();
        bt1=new Button(" Calculate ");
        bt2=new Button(" Clear ");
        heading=new Label(" Find Factorial ");
        txtLabel=new Label("Enter no. ");
        result=new Label();
        f.add(heading);
        heading.setFont(new Font("Arial",Font.BOLD,36));
        heading.setForeground(new Color(2, 94, 17));
        heading.setBounds(100,50,300,50);
        txtLabel.setBounds(120,120,70,50);
        tf.setBounds(220,130,150,30);
        bt1.setBounds(120,180,100,30);
        bt2.setBounds(280,180,100,30);
        result.setBounds(120,240,300,30);
        result.setFont(new Font("Arial",Font.BOLD,16));
        f.add(txtLabel);
        f.add(tf);
        f.add(bt1);
        f.add(bt2);
        f.add(result);
        f.addWindowListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        f.setSize(500,300);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            int n=Integer.parseInt(tf.getText());
            long f=1;
            if(n==0){
                result.setText("1");
            }

            while(n!=0){
                f*=n--;
            }
            result.setText("Factorial is "+Math.abs(f));
        }

    if(e.getSource()==bt2){
        result.setText("");
        tf.setText("");
    }

    }
}

class awtFactorial{
    public static void main(String[] args) {
        Frame1 f1=new Frame1();
    }
}