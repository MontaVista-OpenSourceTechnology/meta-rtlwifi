meta-rtlwifi
================================

[![ci](https://github.com/EmbeddedAndroid/meta-rtlwifi/actions/workflows/ci.yml/badge.svg)](https://github.com/EmbeddedAndroid/meta-rtlwifi/actions/workflows/ci.yml)

	OpenEmbedded/Yocto Project development layer for out of tree Realtek WiFi Linux kernel drivers


At the moment, only USB drivers are added by this layer as most IoT devices
lack support of PCIe and other peripheral connection systems to support
other Realtek chipsets.

[see more information about Realtek WIFI chipsets](realtek-wifi-chipsets.md)


Supported Yocto releases
------------------------

Continuous integration parses the layer and fetches every recipe's
upstream source on each push against the following poky branches:

- kirkstone (4.0 LTS)
- scarthgap (5.0 LTS)
- styhead (5.1)
- walnascar (5.2)

The layer declares compatibility (`LAYERSERIES_COMPAT_rtlwifi`) with
kirkstone through wrynose (6.0 LTS); whinlatter and wrynose are tested
against openembedded-core directly since the combined `poky` repository
is no longer published for releases after walnascar.


Usage
-----

Add the layer to your build configuration:

```
bitbake-layers add-layer <path-to>/meta-rtlwifi
```

Then add the driver(s) you want for your machine, e.g. via
`IMAGE_INSTALL:append` or `MACHINE_EXTRA_RRECOMMENDS`:

```
IMAGE_INSTALL:append = " rtl8821cu"
```


Maintainer
----------

Issues, patches and pull requests are welcome via GitHub:
<https://github.com/EmbeddedAndroid/meta-rtlwifi>

Maintained by EmbeddedAndroid <forcedinductionz@gmail.com>.
