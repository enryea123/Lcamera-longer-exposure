resolvers += "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.6.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("net.sf.proguard" % "proguard-base" % "5.0")

libraryDependencies += "net.sf.proguard" % "proguard-base" % "5.0"
