package main

import (
	"fmt"
)

func main() {
	var a [6]float64
	var i, count int
	var sum float64 = 0
	count = 0
	for i = 0; i < 6; i++ {
		fmt.Scan(&a[i])
	}
	for i = 0; i < 6; i++ {
		if a[i] > 0 {
			count++
			sum = sum + a[i]
		}
	}
	fmt.Printf("%d valores positivos\n", count)
	fmt.Printf("%.1f\n", sum / float64(count))
}
