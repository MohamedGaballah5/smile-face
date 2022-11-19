package com.company;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.QuadCurve2D;
import java.util.Random;

public abstract class project11 extends JFrame {
    int dim1, dim2, w = 200, h = 200;
    int xx = 400, yy = 400;

    public project11() {
        setSize(1000, 1000);
        setVisible(true);
        setLocation(null);
        setTitle("gaballah");
        getContentPane().setBackground(Color.blue);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


 public void paint(Graphics c) {
//        //task 1
//     super.paint(c);
//     Ellipse2D i = new Ellipse2D.Double();
//     Graphics2D gg = (Graphics2D) c;
//     Dimension sizeable = getSize();
//     System.out.println("enter the width" + sizeable.width);
//     System.out.println("enter the high" + sizeable.height);
//     c.setColor(Color.blue);
//     gg.setStroke(new BasicStroke(4));
//     gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//     Random t = new Random();
//     for (int r = 0; r < 100; r++) {
//         int x = Math.abs(t.nextInt()) % sizeable.width;
//         int y = Math.abs(t.nextInt()) % sizeable.height;
//         c.drawLine(x, y, x, y);
//     }
//
//     super.paint(c);
// }
// task2
//    Graphics2D ff = (Graphics2D) c;
//
//   //drawingQuadCurve(ff);
//        ff.setStroke(new BasicStroke(4));
//        ff.setColor(Color.WHITE);
//        ff.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//    RoundRectangle2D r = new RoundRectangle2D.Double(400, 200, 400, 400, 0, 0);
//        ff.draw(r);
//
//        ff.setStroke(new);
//
//    BasicStroke(4));
//        ff.setColor(Color.BLUE);
//        ff.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//    RoundRectangle2D l = new RoundRectangle2D.Double(500, 300, 200, 200, 200, 200);
//        ff.fill(l);
//
//        ff.setStroke(new
//
//    BasicStroke(4);
//        ff.setColor(Color.red);
//        ff.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//    RoundRectangle2D w = new RoundRectangle2D.Double(800, 100, 100, 100, 0, 0);
//        ff.fill(w);
//
//        ff.setStroke(new
//
//    BasicStroke(4));
//        ff.setColor(Color.RED);
//        ff.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//    RoundRectangle2D h = new RoundRectangle2D.Double(300, 600, 100, 100, 0, 0);
//        ff.fill(h);
////
//// task3
        super.paint(c);
        Graphics2D dd = (Graphics2D) c;
        drawingQuadCurve(dd);
        dd.setColor(Color.black);
        dd.setStroke(new BasicStroke(4));
        dd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D k = new RoundRectangle2D.Double(200, 200, 300, 300, 300, 300);
        dd.draw(k);


        dd.setColor(Color.cyan);
        dd.setStroke(new BasicStroke(4));
        dd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D f = new RoundRectangle2D.Double(270, 270, 30, 30, 30, 30);
        dd.fill(f);

        dd.setColor(Color.cyan);
        dd.setStroke(new BasicStroke(4));
        dd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D a = new RoundRectangle2D.Double(430, 270, 30, 30, 30, 30);
        dd.fill(a);
    }
        public void drawingQuadCurve (Graphics2D e){
            Graphics2D rr = (Graphics2D) e;
            rr.setColor(Color.blue);
            rr.setStroke(new BasicStroke(4));
            rr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            QuadCurve2D w = new QuadCurve2D.Double(270, 430, 350, 500, 420, 430);
            rr.draw(w);

            rr.setColor(Color.blue);
            rr.setStroke(new BasicStroke(4));
            rr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            QuadCurve2D q = new QuadCurve2D.Double(345, 300, 380, 430, 335, 385);
            rr.draw(q);
  }
//            // task4
//super.paint(c);
//Graphics2D oo=(Graphics2D) c;
//oo.setColor(Color.black);
//oo.setStroke(new BasicStroke(4));
//oo.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//Ellipse2D i=new Ellipse2D.Double(dim1,dim2,w,h);
//oo.draw(i);
//dim1=xx-(w/2);
//dim2=yy-(h/2);
//////
//oo.drawLine(xx,yy,xx,yy);
//       }
//
//
//
 }
