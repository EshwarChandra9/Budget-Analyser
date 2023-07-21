import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

class DBudget1 implements Serializable
{
    int s,t,gam,r,e,g,w,p,m,gr,c,f,cl,ps,me,fe,sl,mo,ga;
    DBudget1()
    {
        s=0;t=0;gam=0;r=0;e=0;g=0;w=0;p=0;m=0;gr=0;c=0;f=0;cl=0;ps=0;me=0;fe=0;sl=0;mo=0;ga=0;
    }
}

public class DigitalBudget extends JFrame implements ActionListener 
{
	private JPanel contentPane;
	//private JButton btnNewButton;
	//private JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	JButton btnNewButton;
	JLabel lblNewLabel_25;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) throws IOException,FileNotFoundException, NullPointerException, ArrayIndexOutOfBoundsException, EOFException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalBudget frame = new DigitalBudget();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DigitalBudget() {
		super("SR University");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITAL BUDGET ANALYSER");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(223, 10, 186, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter No.of Months:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(76, 61, 128, 17);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(226, 62, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		//textField.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("Salary of the Month:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(76, 88, 139, 17);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 89, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("***Home Expanses***");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(224, 118, 276, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rent:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(76, 156, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(352, 155, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Electricity Bill:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(257, 154, 111, 17);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 155, 96, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Gas/Oil:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(76, 191, 96, 13);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(129, 190, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Water/Trash:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(257, 192, 111, 17);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(352, 190, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Phone:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(76, 225, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(129, 224, 96, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("***DAILY LIVING***");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setBounds(223, 253, 297, 23);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Maintainence Costs:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(257, 225, 152, 18);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(387, 224, 96, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Groceries:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(76, 289, 90, 17);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(145, 290, 96, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Clothing:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(269, 289, 68, 17);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(334, 290, 96, 19);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Food:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(76, 326, 45, 13);
		contentPane.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(145, 325, 96, 19);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Cleaning:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(269, 321, 68, 23);
		contentPane.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(334, 325, 96, 19);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Personal Expanses:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(76, 358, 128, 23);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(201, 362, 96, 19);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("***CHILDREN***");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setForeground(Color.RED);
		lblNewLabel_16.setBounds(223, 410, 122, 17);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Medical:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(76, 442, 83, 17);
		contentPane.add(lblNewLabel_17);
		
		textField_13 = new JTextField();
		textField_13.setBounds(129, 443, 96, 19);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("School Expanses:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(263, 446, 186, 16);
		contentPane.add(lblNewLabel_18);
		
		textField_14 = new JTextField();
		textField_14.setBounds(387, 447, 96, 19);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("***OBLIGATIONS***");
		lblNewLabel_19.setForeground(Color.RED);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_19.setBounds(223, 484, 152, 27);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Student Loans:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(76, 520, 111, 23);
		contentPane.add(lblNewLabel_20);
		
		textField_15 = new JTextField();
		textField_15.setBounds(185, 521, 96, 19);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Tax:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(334, 527, 45, 13);
		contentPane.add(lblNewLabel_21);
		
		textField_16 = new JTextField();
		textField_16.setBounds(389, 524, 96, 19);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("***ENTERTAINMENT***");
		lblNewLabel_22.setForeground(Color.RED);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(223, 558, 169, 23);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Movies:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_23.setBounds(76, 594, 76, 17);
		contentPane.add(lblNewLabel_23);
		
		textField_17 = new JTextField();
		textField_17.setBounds(129, 591, 96, 19);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Games:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(317, 594, 75, 17);
		contentPane.add(lblNewLabel_24);
		
		textField_18 = new JTextField();
		textField_18.setBounds(387, 592, 96, 19);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(181, 672, 100, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(317, 672, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("Click");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(345, 61, 85, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		btnNewButton_3 = new JButton("Click here to view total budget!");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(157, 718, 297, 23);
		contentPane.add(btnNewButton_3);
		
		/*JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_25.setBounds(463, 65, 45, 13);
		contentPane.add(lblNewLabel_25);
		btnNewButton_3.addActionListener(this);*/
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String a;
		int c = 0;
		int s1=0,t1=0,gam1=0,r1=0,e1=0,g1=0,w1=0,p1=0,m1=0,gr1=0,c1=0,f1=0,cl1=0,ps1=0,me1=0,fe1=0,sl1=0,mo1=0,ga1=0;
		String sal,rent,elec,gas,water,phone,maint;
        String groc,clot,food,clean,pers,med,fee,sloan,tax,mov,game;
        int sav=0,sal1=0,tot=0;
        int A=0,B=0,C=0,D=0,E=0,F=0,G=0,H=0,I=0,J=0,K=0,L=0,M=0,N=0,O=0,P=0,Q=0;
        
		/*if(ae.getSource()== btnNewButton_2)
		{
				a=textField.getText();
				c=Integer.parseInt(a);
				//lblNewLabel_25.setText("Stored");
		}*/
		//System.out.println(c);
		int total[]=new int[10];
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("Digital1.txt");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        ObjectOutputStream os = null;
		try {
			os = new ObjectOutputStream(fos);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        DBudget1 obj[]=new DBudget1[c];
		if(ae.getSource()== btnNewButton)
		{
			a=textField.getText();
			c=Integer.parseInt(a);
			for(int i=1;i<c;i++)
			{
				obj[i]=new DBudget1();
				sal=textField_1.getText();
				s1=Integer.parseInt(sal);
                obj[i].s=s1;
                rent=textField_2.getText();
                r1=Integer.parseInt(rent);
                obj[i].r=r1;
                elec=textField_3.getText();
                e1=Integer.parseInt(elec);
                obj[i].e=e1;
                gas=textField_4.getText();
                g1=Integer.parseInt(gas);
                obj[i].g=g1;
                water=textField_5.getText();
                w1=Integer.parseInt(water);
                obj[i].w=w1;
                phone=textField_6.getText();
                p1=Integer.parseInt(phone);
                obj[i].p=p1;
                maint=textField_7.getText();
                m1=Integer.parseInt(maint);
                obj[i].m=m1;
                groc=textField_8.getText();
                gr1=Integer.parseInt(groc);
                obj[i].gr=gr1;
                clot=textField_9.getText();
                c1=Integer.parseInt(clot);
                obj[i].c=c1;
                food=textField_10.getText();
                f1=Integer.parseInt(food);
                obj[i].f=f1;
                clean=textField_11.getText();
                cl1=Integer.parseInt(clean);
                obj[i].cl=cl1;
                pers=textField_12.getText();
                ps1=Integer.parseInt(pers);
                obj[i].ps=ps1;
                med=textField_13.getText();
                me1=Integer.parseInt(med);
                obj[i].me=me1;
                fee=textField_14.getText();
                fe1=Integer.parseInt(fee);
                obj[i].fe=fe1;
                sloan=textField_15.getText();
                sl1=Integer.parseInt(sloan);
                obj[i].sl=sl1;
                tax=textField_16.getText();
                t1=Integer.parseInt(tax);
                obj[i].t=t1;
                mov=textField_17.getText();
                mo1=Integer.parseInt(mov);
                obj[i].mo=mo1;
                game=textField_18.getText();
                ga1=Integer.parseInt(game);
                obj[i].gam=ga1;
                try {
					os.writeObject(obj[i]);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ae.getSource()== btnNewButton_1)
        {
            //a2=jt2.getText();
			textField_1.setText("");textField_2.setText("");textField_3.setText("");textField_4.setText("");textField_5.setText("");
			textField_6.setText("");textField_7.setText("");textField_8.setText("");textField_9.setText("");textField_10.setText("");textField_11.setText("");
			textField_12.setText("");textField_13.setText("");textField_14.setText("");textField_15.setText("");textField_16.setText("");textField_17.setText("");
			textField_18.setText("");
			//jt2.setText("");
        }
        FileInputStream fis = null;
		try {
			fis = new FileInputStream("Digital1.txt");
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        ObjectInputStream is = null;
		try {
			is = new ObjectInputStream(fis);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        DBudget1 obj1[]=new DBudget1[c];
        //System.out.println("---------------------------------");
        //if(ae.getSource()== btnNewButton_3)
        //{
        for(int i=0;i<c;i++)
        {
            obj1[i]=new DBudget1();
            try {
				obj1[i]=(DBudget1)is.readObject();
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
            total[i]=obj1[i].t+obj1[i].gam+obj1[i].r+obj1[i].e+obj1[i].g+obj1[i].w+obj1[i].p+obj1[i].m+obj1[i].gr+obj1[i].c+obj1[i].f+obj1[i].cl+obj1[i].ps+obj1[i].me+obj1[i].fe+obj1[i].sl+obj1[i].mo+obj1[i].ga;
            //A+=obj1[i].r;B+=obj1[i].e;C+=obj1[i].g;D+=obj1[i].w;E+=obj1[i].p;F+=obj1[i].m;G+=obj1[i].gr;H+=obj1[i].c;I+=obj1[i].f;J+=obj1[i].cl;K+=obj1[i].ps;L+=obj1[i].me;M+=obj1[i].fe;N+=obj1[i].sl;O+=obj1[i].t;P+=obj1[i].mo;Q+=obj1[i].gam;
            //tot+=total[i];
            //sal1+=obj1[i].s;
        }
        //}
        for(int i=0;i<c;i++)
        {
	        if(ae.getSource()==btnNewButton_3)
	        {
	            System.out.println("Total Budget for month-"+(i+1)+" : "+total[i]+"\n");	
	        }        	
        }
        
        try {
			fis.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
