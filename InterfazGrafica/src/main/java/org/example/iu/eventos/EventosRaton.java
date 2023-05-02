package org.example.iu.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventosRaton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {//cuando das clic (lo conforma pressed y reased)
        System.out.println();
    }

    @Override
    public void mousePressed(MouseEvent e) { //cuando lo presionas

    }

    @Override
    public void mouseReleased(MouseEvent e) { //cuando lo sueltas

    }

    @Override
    public void mouseEntered(MouseEvent e) { //cuando el cursor entra al componente

    }

    @Override
    public void mouseExited(MouseEvent e) { //cuando sale

    }
}
