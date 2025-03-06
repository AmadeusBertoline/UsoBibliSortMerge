package view;

import bubble.fatec.berto.*;
import merge.fatec.berto.*;

public class MainMerge {

	public static void main(String[] args) {

		BubbleSort b = new BubbleSort();

		// Bubble
		int[] v1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int[] v2 = { 44, 43, 42, 41, 40, 39, 38 };
		int[] v3 = { 101, 102, 103, 125, 124, 123, 104, 105, 106, 122 };

		int[] r1 = new int[v1.length];
		int[] r2 = new int[v2.length];
		int[] r3 = new int[v3.length];

		r1 = b.bubbleSort(v1);
		r2 = b.bubbleSort(v2);
		r3 = b.bubbleSort(v3);

		System.out.println("Vetor 1 - bubble sort: ");

		for (int i = 0; i <= r1.length - 1; i++) {

			System.out.println(r1[i]);

		}

		System.out.println("\n");

		System.out.println("Vetor 2 - bubble sort: ");

		for (int i = 0; i <= r2.length - 1; i++) {

			System.out.println(r2[i]);

		}

		System.out.println("\n");

		System.out.println("Vetor 3 - bubble sort: ");

		for (int i = 0; i <= r3.length - 1; i++) {

			System.out.println(r3[i]);

		}

		System.out.println("\n");

		// Fim bubble

		// Inicio Merge

		r1 = MergeSort.mergeSort(v1);
		r1 = MergeSort.mergeSort(v2);
		r1 = MergeSort.mergeSort(v3);

		System.out.println("Vetor 1 - merge sort: ");

		for (int i = 0; i <= r1.length - 1; i++) {

			System.out.println(r1[i]);

		}

		System.out.println("\n");

		System.out.println("Vetor 2 - merge sort: ");

		for (int i = 0; i <= r2.length - 1; i++) {

			System.out.println(r2[i]);

		}

		System.out.println("\n");

		System.out.println("Vetor 3 - merge sort: ");

		for (int i = 0; i <= r3.length - 1; i++) {

			System.out.println(r3[i]);

		}
	}
}
