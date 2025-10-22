       Stream<Integer> sortedValues = nums.stream()
   			.filter(n-> n%2==0)
   			.sorted();