// tag::plugins[]
plugins {
    `base`
}
// end::plugins[]

// tag::copytask[]
task<Copy>("copySources") {
    description = "Copies sources to the dest directory"
    group = "Custom"

    from("src")
    into("$buildDir/dest")  // <1>
}
// end::copytask[]
