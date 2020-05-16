package KAMN;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class laba {
	 public static void main(String args[]) {

		 String dlina = JOptionPane.showInputDialog("Длина (см)");
		 
        Font font = new Font(null, Font.ITALIC, 23);
        Font font1 = new Font(null, Font.ITALIC, 11);
        
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) frame.getContentPane();
        Dimension size = new Dimension(200, 200);
        frame.setLayout(null);
        
        JLabel label11 = new JLabel("ФГБОУ ВО");
        panel.add(label11);
        label11.setFont(font);
        label11.setBounds(450, -50, size.width, size.height);
        
        JLabel label12 = new JLabel("Уфимский государственный авиационный технический университет");
        panel.add(label12);
        label12.setFont(font);
        label12.setBounds(600, -50, size.width+700, size.height);
        
        JLabel label13 = new JLabel(information.Info);
        panel.add(label13);
        label13.setFont(font1);
        label13.setBounds(925, 250, size.width+700, size.height+50);
        
        JLabel label1 = new JLabel("ПИ-218");
        panel.add(label1);
        label1.setFont(font);
        label1.setBounds(750, 20, size.width, size.height);

        
        JLabel label2 = new JLabel("Носков С.К");
        panel.add(label2);
        label2.setFont(font);
        label2.setBounds(600, 100, size.width, size.height);
        
        JLabel label4 = new JLabel("Красько Е.Е");
        panel.add(label4);
        label4.setFont(font);
        label4.setBounds(600, 200, size.width, size.height);
        
        JLabel label6 = new JLabel("Аликин В.П.");
        panel.add(label6);
        label6.setFont(font);
        label6.setBounds(600, 300, size.width, size.height);
    
        JLabel label8 = new JLabel("Мирзаева Ш.А.");
        panel.add(label8);
        label8.setFont(font);
        label8.setBounds(600, 400, size.width, size.height);
       
        JLabel label10 = new JLabel("V=" + 0.55*100*0.01*100*Double.parseDouble(dlina)+"cм^3 = " + 0.55*0.01*Double.parseDouble(dlina)*0.01 +"м^3");
        panel.add(label10);
        label10.setFont(font);
        label10.setBounds(610, 500, size.width+1000, size.height);
        
        JButton infoBut = new JButton("Информация");
        panel.add(infoBut);
        infoBut.setFont(font);
        infoBut.setBounds(200, 700, size.width, size.height);
        
        ImageIcon imgIco = new ImageIcon("./src/usatu.jpg");
        Image image = imgIco.getImage();
        Image newimg = image.getScaledInstance(450, 200,  java.awt.Image.SCALE_SMOOTH);
        imgIco = new ImageIcon(newimg); 
        JLabel img = new JLabel(imgIco);
        panel.add(img);
        img.setBounds(0,0, size.width+250,size.height+250);
        
        JLabel LabInfoAdd = new JLabel("Кнопка информации добавлена");
        panel.add(LabInfoAdd);
        LabInfoAdd.setFont(font);
        LabInfoAdd.setBounds(1000, 800, size.width+400, size.height);
        
        JButton button1 = new JButton("Кнопка");
        panel.add(button1);
        button1.setFont(font);
        button1.setBounds(200, 500, size.width, size.height);

        button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	 ImageIcon imgIco1 = new ImageIcon("./src/memo.jpg");
             Image image1 = imgIco1.getImage();
             Image newimg1 = image1.getScaledInstance(450, 200, java.awt.Image.SCALE_SMOOTH);
             imgIco1 = new ImageIcon(newimg1);
             JLabel img1 = new JLabel(imgIco1);
        	panel.add(img1);
        	img1.setBounds(500,500, size.width+250,size.height+250);
        }
        });
        
        frame.setPreferredSize(new Dimension(400, 600));
      
        frame.setSize(1500, 1000);
        frame.setVisible(true);    
   }
}
