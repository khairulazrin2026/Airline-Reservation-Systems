import model.Employee;
import model.Leave;
import model.PaySlip;
import model.Payroll;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Employee;
import model.Leave;
import model.PaySlip;
import model.Payroll;
import model.Print;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class InternationalFlight extends JFrame
{
    JComboBox CBFrom, CBTo, CBClass, CBAdult, CBChildren, CBInfant;
    JLabel LFrom, LTo, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LImg1, LImg2, LNotes;
    JTextField TFBookingDate;
    Icon img1, img2;
    JButton BFindFlight;
    JPanel PPanel1, PPanel2;

    LoginPage type1import java.awt.Toolkit;


    public static class Home extends javax.swing.JFrame {
//Creating Objects

        Employee objEmployee = new Employee();
        Payroll objPayroll = new Payroll();
        PaySlip objPaySlip = new PaySlip();
        Leave objLeave = new Leave();
    }