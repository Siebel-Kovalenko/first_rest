package rest.parallelogram.first_rest.service;


import org.springframework.stereotype.Service;

@Service
public class Parallelogram {
    private double a = 5.0;
    private double b = 10.0;
    private double angle = 30.0;


    public Parallelogram() {
    }

    public String desciptionFigure(String figure) {
        if (figure.equalsIgnoreCase("parallelogram")) {
            StringBuilder descriptionString = new StringBuilder();
            descriptionString.append(figure).append(" has next params of sides: ").append(a).append(", ").append(b).append(", and angle is: ").append(angle);
            return  descriptionString.toString();
        }
        return "WRONG NAME OF OPERATION, YOU NEED -parallelogram-";
    }


    public String calculatePerimeter(String operation) {
        if (operation.equalsIgnoreCase("perimeter")) {
            double perimeter = 2.0 * (a + b);
            StringBuilder perimeterString = new StringBuilder();
            perimeterString.append(operation).append(": = ").append(perimeter);
            return  perimeterString.toString();
        }
        return "WRONG NAME OF OPERATION, YOU NEED -perimeter-";
    }

    public String calculateSquare(String operation) {
        if (operation.equalsIgnoreCase("square")) {
            double square = a * b * Math.sin(Math.toRadians(angle));
            StringBuilder squareString = new StringBuilder();
            squareString.append(operation).append(": = ").append(square);
            return  squareString.toString();
        }
        return "WRONG NAME OF OPERATION, YOU NEED -square-";
    }
}
