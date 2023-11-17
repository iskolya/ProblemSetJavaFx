package ProblemSet10;

import java.util.*;
class Darts {
    int score(double xOfDart, double yOfDart) {
        int score =0;
        double dist = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);
        if(dist>10)
            score =0;
        if(dist>5 && dist <=10)
            score = 1;
        if(dist>1 && dist <=5)
            score = 5;
        if(dist<=1)
            score = 10;
        return score;
    }
}