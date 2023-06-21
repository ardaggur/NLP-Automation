package UI;

import Run.CucumberTestRunner;
import Run.Database;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.runner.JUnitCore;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;

public class UserInterface extends JFrame implements ActionListener {

    JButton selectFile;
    JButton inputFormatButton;
    JButton databaseButton;
    JButton reports;
    JButton clearDatabase;
    JButton fileEdit;
    JButton createFile;

    Database database = new Database();

    String report;
    String operation;

    private ImageIcon backgroundImage;
    private JLabel backgroundLabel;

    public UserInterface(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            database.runDb();
        }catch (Exception e) {

        }

        this.setTitle("Selenium Web Automation");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);


        selectFile = new JButton("Select File");
        selectFile.addActionListener(this);
        selectFile.setBounds(150,100,200,50);
        //selectFile.setBackground(Color.BLUE);
        selectFile.setOpaque(true);
        panel.add(selectFile);

        inputFormatButton = new JButton("Input Format");
        inputFormatButton.addActionListener(this);
        inputFormatButton.setBounds(150,200,200,50);
        //inputFormatButton.setBackground(Color.GREEN);
        inputFormatButton.setOpaque(true);
        panel.add(inputFormatButton);

        databaseButton = new JButton("Previous Operations");
        databaseButton.addActionListener(this);
        databaseButton.setBounds(150,250,200,50);
        //databaseButton.setBackground(Color.YELLOW);
        databaseButton.setOpaque(true);
        panel.add(databaseButton);

        reports = new JButton("Reports");
        reports.addActionListener(this);
        reports.setBounds(150,300,200,50);
        //reports.setBackground(Color.ORANGE);
        reports.setOpaque(true);
        panel.add(reports);

        clearDatabase = new JButton("Clear History");
        clearDatabase.addActionListener(this);
        clearDatabase.setBounds(150,350,200,50);
        //clearDatabase.setBackground(Color.RED);
        clearDatabase.setOpaque(true);
        panel.add(clearDatabase);

        fileEdit = new JButton("Edit File");
        fileEdit.addActionListener(this);
        fileEdit.setBounds(150,150,200,50);
        fileEdit.setOpaque(true);
        panel.add(fileEdit);

        createFile = new JButton("Create File");
        createFile.addActionListener(this);
        createFile.setBounds(150,50,200,50);
        createFile.setOpaque(true);
        panel.add(createFile);



        this.add(panel);
        this.pack();
        this.setSize(500,500);

        backgroundImage = new ImageIcon("/Users/ardagur/Desktop/pastel-green.png");
        backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
        panel.add(backgroundLabel);


        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==selectFile)
        {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            fileChooser.setFileFilter(filter);

            int response = fileChooser.showOpenDialog(null);       //select file to open

            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    FileWriter writer = new FileWriter("src/test/java/features/Addition.feature");
                    writer.write("Feature: Scenario\nScenario: Automation\nGiven Open \"https://www.amazon.com.tr/\"\nWhen ");  //burada feature file'in icine onceden yazdıklarımı yazıyorum
                    String line;
                    String scenario = "";
                    while ((line = reader.readLine()) != null) {
                        scenario = scenario.concat(line + " ");
                        writer.write(line + "\n");
                    }
                    writer.write("Then Go"); //burada feature file'in icine sonradan koyucaklarım
                    reader.close();
                    writer.close();

                    operation = scenario;

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
            JUnitCore.runClasses(CucumberTestRunner.class);

            String featureFilePath = "src/test/java/features/Addition.feature";
            File file = new File(featureFilePath);
            file.delete();

            report = getReport().toString();

            try {
                database.insertOperation(operation,report);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            System.exit(0);

        }

        if (e.getSource() == inputFormatButton)
        {
            JOptionPane.showMessageDialog(null,"\nOperations: Login with \"mail address\" and \"password\"\n" +
                    "                   Search \"product name you want to search\"\n" +
                    "                   View cart\n" +
                    "                   View orders\n" +
                    "                   View account\n" +
                    "                   Add \"product name you want to add\" to cart\n" +
                    "                   Complete the transaction\n" +
                    "                   Open musteri hizmetleri\n" +
                    "                   Open satis yap\n" +
                    "                   Open gunun firsatlari\n" +
                    "                   Open prime\n" +
                    "                   Close cookies\n" +
                    "                   Show cok satanlar\n" +
                    "                   Show yeni cikanlar\n" +
                    "                   Show en iyi performans gosterenler\n" +
                    "                   Category \"category name you want to search\"\n" +
                    "                   Category \"category name you want to search\" Subcategory \"subcategory name you want to search\"\n" +
                    "\n** YOUR TXT FILE MUST BE IN THIS FORMAT **\n" + "\n" +
                    "\nWrite the \"Operations\" that you want to perform in your .txt file" +
                    "(if you want to make multiple operations, you can add) And \"Operations\"\n");
        }

        if(e.getSource() == databaseButton)
        {
            JFrame frame = new JFrame("Previous Operations");
            frame.setSize(1000,500);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);

            final JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            try {
                textArea.setText(database.displayDatabase("Operations"));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.getContentPane().add(scrollPane);

            textArea.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent e)
                {
                    if(e.getClickCount() == 2)
                    {
                        int offset = textArea.viewToModel(e.getPoint());
                        try{
                            int rowStart = Utilities.getRowStart(textArea,offset);
                            int rowEnd = Utilities.getRowEnd(textArea,offset);
                            String selectedText = textArea.getText().substring(rowStart,rowEnd);

                            System.out.println("Sectiginiz text: " + selectedText);

                            String yeniCumle = "";
                            int kelimeIndex = 0;
                            while (kelimeIndex < selectedText.length()) {
                                int andIndex = selectedText.indexOf("And", kelimeIndex);
                                if (andIndex == -1) {
                                    yeniCumle = yeniCumle.concat(selectedText.substring(kelimeIndex));
                                    break;
                                } else {
                                    yeniCumle = yeniCumle.concat(selectedText.substring(kelimeIndex, andIndex)).concat("\nAnd ");
                                    kelimeIndex = andIndex + 4; // 4, "And " kelimesinin uzunluğudur.
                                }
                            }
                            System.out.println(yeniCumle);

                            FileWriter writer = new FileWriter("src/test/java/features/Addition.feature");
                            writer.write("Feature: Scenario\nScenario: Automation\nGiven Open \"https://www.amazon.com.tr/\"\nWhen ");
                            writer.write(yeniCumle);
                            writer.write("\nThen Go");
                            writer.close();

                            JUnitCore.runClasses(CucumberTestRunner.class);

                            String featureFilePath = "src/test/java/features/Addition.feature";
                            File file = new File(featureFilePath);
                            file.delete();

                            System.exit(0);

                        }catch(BadLocationException | IOException ex)
                        {
                            ex.printStackTrace();
                        }
                    }
                }
            });
        }

        if ((e.getSource()==clearDatabase))
        {
            try {
                database.clearTable();
                database.resetAutoIncrement();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if ((e.getSource()==reports))
        {
            JFrame frame = new JFrame("Reports");
            frame.setSize(1000,500);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);

            final JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            try {
                textArea.setText(database.displayDatabase("Operations"));
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.getContentPane().add(scrollPane);

            textArea.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) { // çift tıklandı mı kontrol et
                        int y = e.getY();
                        int lineHeight = textArea.getFontMetrics(textArea.getFont()).getHeight();
                        int selectedRow = y / lineHeight + 1;
                        System.out.println("Selected row number: " + selectedRow);

                        String rapor;
                        try {
                            rapor = database.getReportById(selectedRow);
                            //System.out.println(rapor);
                            String outputString = rapor.substring(1, rapor.length()-1);
                            outputString = outputString.substring(0, outputString.length());

                            //System.out.println(outputString);

                            JSONObject jsonObject = new JSONObject(outputString); //bunu aldın icine getreportbyid'den aldıgını koydun

                            JSONArray steps = jsonObject.getJSONArray("steps");

                            //long totalDuration = 0; //BUNU YENI EKLEDIM
                            // Her adım için keyword, name ve status değerlerini ekrana yazdır
                            StringBuilder output = new StringBuilder();
                            for (int i = 0; i < steps.length(); i++) {
                                JSONObject step = steps.getJSONObject(i);
                                JSONObject result = step.getJSONObject("result");
                                String keyword = step.getString("keyword");
                                String name = step.getString("name");
                                //long duration = result.getLong("duration"); //BUNU YENI EKLEDIM
                                String status = result.getString("status");
                                //System.out.println("Step " + (i+1) + ": " + keyword + name + " , " + status);

                                //totalDuration += duration; //BUNU YENI EKLEDIM
                                //double durationInSeconds = duration / 1000.0; //BUNU YENI EKLEDIM
                                output.append("Step ").append(i+1).append(": ").append(keyword).append(name).append(" , ").append(status).append("\n");
                                /*output.append("Step ").append(i+1).append(": ").append(keyword).append(name)
                                        .append(", Duration: ").append(durationInSeconds).append("s, Status: ").append(status)
                                        .append("\n");//BUNU YENI EKLEDIM*/
                            }




                            JOptionPane.showMessageDialog(null, output.toString(), "Report", JOptionPane.INFORMATION_MESSAGE);


                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }


                    }
                }
            });

        }

        if(e.getSource() == fileEdit)
        {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Choose File");

            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt");
            fileChooser.setFileFilter(filter);

            int userSelection = fileChooser.showOpenDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToOpen = fileChooser.getSelectedFile();

                try {
                    BufferedReader reader = new BufferedReader(new FileReader(fileToOpen));
                    StringBuilder fileContent = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        fileContent.append(line).append("\n");
                    }

                    reader.close();

                    JTextArea textArea = new JTextArea(fileContent.toString());
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));

                    int option = JOptionPane.showOptionDialog(null, scrollPane, "Edit", JOptionPane.OK_CANCEL_OPTION,
                            JOptionPane.PLAIN_MESSAGE, null, null, null);

                    if (option == JOptionPane.OK_OPTION) {
                        String editedContent = textArea.getText();

                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToOpen));
                        writer.write(editedContent);
                        writer.close();
                        JOptionPane.showMessageDialog(null, "The file has been edited and saved.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Edit cancelled.");
                    }
                } catch (Exception except) {
                    JOptionPane.showMessageDialog(null, "Something went wrong: " + except.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "File selection has been cancelled.");
            }
        }

        if(e.getSource() == createFile)
        {
            String isim = JOptionPane.showInputDialog("Enter file name:");

            // Dosya yolu
            String dosyaYolu = "/Users/ardagur/Desktop/" + isim + ".txt";

            try {
                // Dosya oluşturma
                File dosya = new File(dosyaYolu);
                dosya.createNewFile();
                System.out.println("File created: " + dosya.getAbsolutePath());

                // Dosyanın içeriğini doldurma
                JTextArea textArea = new JTextArea(10, 50);
                textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

                JScrollPane scrollPane = new JScrollPane(textArea);

                int option = JOptionPane.showOptionDialog(null, scrollPane, "Enter file content",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                if (option == JOptionPane.OK_OPTION) {
                    String icerik = textArea.getText();

                    BufferedWriter writer = new BufferedWriter(new FileWriter(dosya));
                    writer.write(icerik);
                    writer.close();
                    System.out.println("File content written.");
                } else {
                    System.out.println("Content entry canceled.");
                }
            } catch (IOException excep) {
                excep.printStackTrace();
            }
        }

    }

    private JSONArray getReport() {

        JSONArray jsonArray = null;
        try (FileReader reader = new FileReader("target/cucumber.json")) {
            JSONTokener tokener = new JSONTokener(reader);
            jsonArray = new JSONArray(tokener);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        JSONObject json = jsonArray.getJSONObject(0);

        try (FileWriter file = new FileWriter("target/cucumber.json")) {
            json.write(file);
            file.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //------------------------------------

        try {
            BufferedReader reader = new BufferedReader(new FileReader("target/cucumber.json"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null)
            {
                stringBuilder.append(line);
            }
            reader.close();

            String jsonString = stringBuilder.toString();

            JSONObject jsonObject = new JSONObject(jsonString);

            JSONArray elements = jsonObject.getJSONArray("elements");

            return elements;


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return null;
    }



}
