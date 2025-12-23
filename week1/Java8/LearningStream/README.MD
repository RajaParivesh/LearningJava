# Stream

If you want to use **.map, .reduce, .filter** then you **first** need to **convert the collection** into the **stream**

## Benifits of using Stream

**Readability:** Streams provide a more **readable** and expressive way to perform operations on collections. The syntax is concise and easy to understand, making it easier for other developers to **read** and **maintain** your code.

**Flexibility:** Streams allow you to perform a variety of operations on collections, such as **filtering, mapping, and reducing**, _without having to write multiple loops or methods_. This can save time and make your code more flexible.

**Parallelism:** Streams can be processed in **parallel**, which can provide a significant performance boost for large collections. With a for loop, you would have to write your own **multi-threaded** code to achieve parallelism.

**Encapsulation:** Streams encourage encapsulation, as you can perform a series of operations on a collection without modifying the original data. This can help prevent bugs and improve code reliability.


# Stream vs Parallel Stream (Java 8+)

| Aspect | `stream()` | `parallelStream()` |
|------|------------|--------------------|
| Execution | Sequential | Parallel (multi-threaded) |
| Threads Used | Single thread | ForkJoinPool.commonPool |
| Order Guarantee | Preserves order | Order NOT guaranteed |
| Safety | Safer by default | Risk of race conditions |
| Performance | Predictable | Can be faster or slower |
| Best Use Case | General backend logic | CPU-intensive tasks |
| Data Size | Small to medium | Large (10k+ elements) |
| Shared State | Safe | Dangerous if mutable |
| I/O Operations | Suitable | NOT recommended |
| Debugging | Easy | Harder |
| Default Choice | ✅ Yes | ⚠️ Only if justified |

## Example

### stream()
```java
list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

### parallelStream()
```java
list.parallelStream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

### Rule of Thumb

- Use stream() by default

- Use parallelStream() only after benchmarking


# Java Stream API – Complete Function List (Java 8+)

---

## 1. Stream Creation Methods

| Method | Description |
|------|------------|
| `stream()` | Create stream from Collection |
| `parallelStream()` | Create parallel stream |
| `Stream.of()` | Create stream from values |
| `Arrays.stream()` | Create stream from array |
| `IntStream.range()` | Primitive int stream (exclusive end) |
| `IntStream.rangeClosed()` | Primitive int stream (inclusive) |
| `Stream.generate()` | Infinite stream |
| `Stream.iterate()` | Infinite stream with seed |

---

## 2. Intermediate Operations (Lazy)

> These return a **Stream** and do NOT execute immediately.

### Filtering & Slicing

| Method | Description |
|------|------------|
| `filter()` | Filter elements |
| `distinct()` | Remove duplicates |
| `limit()` | Limit number of elements |
| `skip()` | Skip elements |

---

### Mapping & Transformation

| Method | Description |
|------|------------|
| `map()` | Transform elements |
| `mapToInt()` | Convert to IntStream |
| `mapToLong()` | Convert to LongStream |
| `mapToDouble()` | Convert to DoubleStream |
| `flatMap()` | Flatten nested streams |
| `flatMapToInt()` | Flatten to IntStream |

---

### Sorting

| Method | Description |
|------|------------|
| `sorted()` | Natural sorting |
| `sorted(Comparator)` | Custom sorting |

---

### Peeking (Debugging)

| Method | Description |
|------|------------|
| `peek()` | Inspect elements (debugging) |

---

## 3. Terminal Operations (Eager)

> These **trigger execution** of the stream.

### Iteration

| Method | Description |
|------|------------|
| `forEach()` | Iterate elements |
| `forEachOrdered()` | Ordered iteration |

---

### Reduction

| Method | Description |
|------|------------|
| `reduce()` | Reduce to single value |
| `count()` | Count elements |
| `min()` | Minimum element |
| `max()` | Maximum element |

---

### Matching

| Method | Description |
|------|------------|
| `anyMatch()` | Any element matches |
| `allMatch()` | All elements match |
| `noneMatch()` | No elements match |

---

### Finding

| Method | Description |
|------|------------|
| `findFirst()` | First element |
| `findAny()` | Any element |

---

### Collecting

| Method | Description |
|------|------------|
| `collect()` | Convert to collection |
| `toList()` | Convert to List (Java 16+) |
| `toArray()` | Convert to array |

---

## 4. Common Collectors (`Collectors`)

| Collector | Description |
|---------|------------|
| `toList()` | List |
| `toSet()` | Set |
| `toMap()` | Map |
| `groupingBy()` | Group elements |
| `partitioningBy()` | Split into true/false |
| `joining()` | Join strings |
| `counting()` | Count |
| `mapping()` | Map + collect |
| `filtering()` | Filter + collect |
| `reducing()` | Reduce |
| `averagingInt()` | Average |
| `summingInt()` | Sum |

---

## 5. Numeric Stream Methods (`IntStream`, `LongStream`, `DoubleStream`)

| Method | Description |
|------|------------|
| `sum()` | Sum |
| `average()` | Average |
| `summaryStatistics()` | Min, Max, Avg, Count |
| `boxed()` | Convert to Stream<Integer> |

---

## 6. Parallel Stream Specific

| Method | Description |
|------|------------|
| `parallel()` | Convert to parallel stream |
| `sequential()` | Convert to sequential stream |

---

## 7. Short-Circuiting Operations

| Method | Description |
|------|------------|
| `limit()` | Stops early |
| `findFirst()` | Stops early |
| `findAny()` | Stops early |
| `anyMatch()` | Stops early |

---

## 8. Important Rules (Must Remember)

- Streams are **single-use**
- Intermediate ops are **lazy**
- Terminal ops trigger execution
- Avoid shared mutable state
- Prefer `stream()` over `parallelStream()`

---

## Interview Tip
> You don’t need to memorize all methods — understand **filter, map, reduce, collect, groupingBy** deeply.

---
