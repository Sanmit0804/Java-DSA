## 2D Arrays in Java

### Introduction
A 2D array is an array of arrays. It can be thought of as a table with rows and columns. Each element in a 2D array is accessed using two indices: one for the row and one for the column.

### Declaration and Initialization
1. **Declaration:**
   ```java
   dataType[][] arrayName;
   ```

2. **Instantiation:**
   ```java
   arrayName = new dataType[rows][columns];
   ```

3. **Combined Declaration and Instantiation:**
   ```java
   dataType[][] arrayName = new dataType[rows][columns];
   ```

4. **Initialization with Values:**
   ```java
   int[][] arrayName = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   ```

### Accessing Elements
To access an element in a 2D array, specify the row and column indices:
```java
arrayName[rowIndex][columnIndex];
```

### Example
```java
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing an element
int num = numbers[1][2]; // This will get the value 6
```

### Traversing a 2D Array
To traverse a 2D array, you typically use nested loops:
```java
for (int i = 0; i < arrayName.length; i++) { // for each row
    for (int j = 0; j < arrayName[i].length; j++) { // for each column in the row
        System.out.print(arrayName[i][j] + " ");
    }
    System.out.println(); // new line after each row
}
```

### Modifying Elements
To modify an element in a 2D array:
```java
arrayName[rowIndex][columnIndex] = newValue;
```

### Common Operations
1. **Finding the Length:**
   - Number of rows: `arrayName.length`
   - Number of columns in a specific row: `arrayName[rowIndex].length`

2. **Filling a 2D Array:**
   ```java
   for (int i = 0; i < arrayName.length; i++) {
       for (int j = 0; j < arrayName[i].length; j++) {
           arrayName[i][j] = someValue;
       }
   }
   ```

### Example Programs

#### Sum of All Elements in a 2D Array
```java
int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int sum = 0;
for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
    }
}
System.out.println("Sum of all elements: " + sum);
```

#### Transpose of a 2D Array
```java
int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int[][] transpose = new int[array[0].length][array.length];

for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
        transpose[j][i] = array[i][j];
    }
}

// Printing the transposed array
for (int i = 0; i < transpose.length; i++) {
    for (int j = 0; j < transpose[i].length; j++) {
        System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
}
```

### Important Points to Remember
1. **Index Out of Bounds:**
   Accessing an index outside the bounds of the array will throw `ArrayIndexOutOfBoundsException`.
   
2. **Jagged Arrays:**
   Java allows the creation of "jagged" arrays where each row can have a different number of columns.
   ```java
   int[][] jaggedArray = new int[3][];
   jaggedArray[0] = new int[2];
   jaggedArray[1] = new int[3];
   jaggedArray[2] = new int[1];
   ```

3. **Default Values:**
   - For numeric types, the default value is 0.
   - For boolean types, the default value is `false`.
   - For object references, the default value is `null`.

### Practical Usage
2D arrays are useful in various scenarios, such as:
- Representing matrices in mathematical computations.
- Storing image data where each pixel can be represented by a value.
- Game boards (e.g., tic-tac-toe, chess).
- Tabular data storage.

---

These notes cover the basics and some advanced usage of 2D arrays in Java.
