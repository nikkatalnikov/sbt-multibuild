# SBT multi build starter kit

Multi-build template with common dependencies sbt project (implemented as sbt plugin).

Tested with IntelliJ Idea CE. 
NB: import each application as a new module.

Special thanks to Vitaliy Savkin.


## Troubleshooting

To avoid Ivy lock, we recommend to install coursier plugin:
https://get-coursier.io/docs/sbt-coursier.html

Example for global `~/.sbt/1.0/plugins/build.sbt`:

```
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M9")
```

Also, to speed up sbt build, you might check "Use sbt shell" while importing your project into IDE:
https://stackoverflow.com/a/47483603 (but from my observations it slows it down


Don't import from the repo's root into IDE. Instead, import each porject separately (try `app1` that depends on `common_1`, `common_2` and `common_sbt` as a plugin for dependency management).
