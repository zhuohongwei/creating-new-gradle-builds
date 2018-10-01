task<Copy>("copySources") {
    description = "Copies sources to the dest directory"
    group = "Custom"

    from("src")
    into("dest")
}
