SUMMARY = "RTL8814AU kernel driver (wifi)"
DESCRIPTION = "RTL8814ABU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

SRCREV = "b1866ce2b857a8dfe2e147e19eb8eca0a842ce18"
SRC_URI = "git://github.com/morrownr/8814au;protocol=https;branch=main \
           file://0001-Add-make-target-modules_install.patch \
           "
PV = "5.8.5.1-git+2026.02"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
