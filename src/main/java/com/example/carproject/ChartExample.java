package com.example.carproject;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.List;

public class ChartExample extends JFrame {

    public ChartExample(String title, List<Car> cars) {
        super(title);

        DefaultCategoryDataset dataset = createDataset(cars);

        JFreeChart chart = ChartFactory.createBarChart(
                "Car Speed",
                "Car",
                "Speed (km/h)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset(List<Car> cars) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Car car : cars) {
            dataset.addValue(car.getSpeed(), car.getBrand(), car.getModel());
        }

        return dataset;
    }

    public static void main(String[] args) {
        CarHandler handler = new CarHandler();
        handler.generateCars(10);

        SwingUtilities.invokeLater(() -> {
            ChartExample example = new ChartExample("Car Speed Chart", handler.getCars());
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
