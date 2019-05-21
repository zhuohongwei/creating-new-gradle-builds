plugins {
    id("com.gradle.build-scan") version "2.3"
    id("org.gradle.guides.getting-started") version "0.15.5"
    id("org.gradle.guides.test-jvm-code") version "0.15.5"
    id("org.gradle.guides.ci.travis") version "0.15.5"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/creating-new-gradle-builds"
    mainAuthor = "Ken Kousen"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
}

configure<org.gradle.guides.ci.TravisExtension> {
    encryptedVariables.add("PAanY+N15BbhHr3DHnuuMtgJR82aAEMIChLzeK+b1ZEXQtDHjfKsi3ivvlZmavLps9kz9aNlXHyA7mxCWIZv3YTJ3CUqcAmAYQVHswGYHmWtq2BqPkNzXeQmZ34cOAYz6MIMndhs3afWfhSk0BYCWTshffZw/itogugeWwAZcEUho1OnTPsluh9YJ7tjpZa2XOvHZC1DjQsmzWUbEge905ueEkIaWgce9NyovFl1TqCs9H3XnS3bEfOY+/UDN8YLWwhN7xVZkrG0UjOevYShWDdxeJiPsjizLFAe9Tt376AGK7RGHVubTa2SSDFQeUkmUfm4GsQnWyhGu1XHV+sPR9j8aKA+aXOzrQU4VbTldVSDDtx6YwZ+9I/ie01xTfSN/5mv0lFZnPrq89jv/FtSnjb5gdY5c4TnLjyFHAys63kP+cwzamolCTHObVBgRAZ/qhuZVx7WHi0BTpK5wU42Z9mOdxSKo+U3ktBimNC1XKo2JiK2rfD0d79lFZixcHQB6q5e2UZ/Y9qaN2VIN/6iATzSHZGYQO3EPfOa6JuMKRovrneHurCj67ZJ6WCzp999c7ePIzxkGaHT3pu6bgA4qnC/xNhP2Sg/eG/mGIIngkpMAa4BCnQhv/tO/UxAT7zgSaTdT4O7D8dWrqguq4Y6lHbcAoJ+EL2ahJdG8QYhccI=")
}