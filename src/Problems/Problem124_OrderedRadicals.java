/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem124_OrderedRadicals {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(100000);
        
        Point[] radicals = new Point[100001];
        // x coordinate is n, y coordinate is rad(n)
        for (int i = 0; i < radicals.length; i++) {
            radicals[i] = new Point(i, i);
            for (int p : primes) {
                if (p > i)
                    break;
                while (radicals[i].y % (p * p) == 0)
                    radicals[i].y /= p;
            }
        }
        
        Point[] orderedRadicals = mergeSort(radicals);
        
        System.out.println(orderedRadicals[10000]);
    }
    
    public static Point[] mergeSort (Point[] a) {
        if (a.length <= 1)
            return a;
        
        int mid = a.length / 2;
        
        Point[] left = new Point[mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }
        
        Point[] right = new Point[a.length - mid];
        for (int i = mid; i < a.length; i++) {
            right[i - mid] = a[i];
        }
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        Point[] result = merge(left, right);
        return result;
    }
    
    public static Point[] merge(Point[] left, Point[] right) {
        Point[] result = new Point[left.length + right.length];
        int leftCounter = 0, rightCounter = 0;
        while (leftCounter < left.length && rightCounter < right.length) {
            if (left[leftCounter].y < right[rightCounter].y || left[leftCounter].y == right[rightCounter].y && left[leftCounter].x < right[rightCounter].x) {
                result[leftCounter + rightCounter] = left[leftCounter];
                leftCounter++;
            } else {
                result[leftCounter + rightCounter] = right[rightCounter];
                rightCounter++;
            }
        }
        
        if (leftCounter == left.length) {
            for (int i = rightCounter; i < right.length; i++) {
                result[leftCounter + i] = right[i];
            }
        }
        
        if (rightCounter == right.length) {
            for (int i = leftCounter; i < left.length; i++) {
                result[rightCounter + i] = left[i];
            }
        }
        return result;
    }
}
