import java.awt.*;
import java.awt.event.*;

class Frame1 extends WindowAdapter implements ActionListener{
    Frame f;
    TextField tf;
    Button bt1,bt2;
    Label heading,result,txtLabel;

    Frame1(){
        f=new Frame("Prime no.");
        tf=new TextField();
        bt1=new Button(" Check ");
        bt2=new Button(" Clear ");
        heading=new Label("Prime Number Checker");
        txtLabel=new Label("Enter no. ");
        result=new Label();
        f.add(heading);
        heading.setFont(new Font("Serif",Font.BOLD,36));
        heading.setForeground(new Color(0, 33, 122));
        heading.setBounds(100,50,300,50);
        txtLabel.setBounds(120,120,70,50);
        tf.setBounds(220,130,150,30);
        bt1.setBounds(120,180,100,30);
        bt2.setBounds(280,180,100,30);
        result.setBounds(160,240,220,30);
        result.setFont(new Font("Serif",Font.BOLD,16));
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
        if(e.getSource()==bt1)
        {int n=Integer.parseInt(tf.getText());
        boolean b=true;

        if(n<=1){
            b=false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                b=false;
            }
        }

        if(b==true){
            result.setText(n+" is a Prime no.");
        }else{
            result.setText(n+" is not a Prime no.");
        }
    }

    if(e.getSource()==bt2){
        result.setText("");
        tf.setText("");
    }

    }
}

class awtPrime{
    public static void main(String[] args) {
        Frame1 f1=new Frame1();
    }
}