class ExcitingApp {

    // Creates a new unset stable value with no content
    private final StableValue<Logger> logger = StableValue.ofUnset();

    Logger getLogger() {
        return logger.orElseSet( () -> Logger.create(Component.class) );
    }

    void process() {
        logger.get().info("Process started");
        // ...
    }
 }
