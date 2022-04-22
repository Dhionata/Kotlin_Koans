class LazyProperty(val initializer: () -> Int) {

    val lazy2: Int by lazy {
        initializer()
    }

    val lazy: Int
        get() {
            return lazy2
        }
}
