SUMMARY = "RTL88x2BU kernel driver (wifi)"
DESCRIPTION = "RTL88x2BU kernel driver (like RTL8812BU)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

# Track an EmbeddedAndroid fork of morrownr/88x2bu-20210702. The
# 'embeddedandroid' branch carries kernel 6.16+ compat: timer rename
# shim and a corrected radio_idx guard (kernel 6.17, not 6.18).
SRCREV = "42b9a5cd57e8c155b031515042edbf102691a9da"
SRC_URI = " \
	git://github.com/EmbeddedAndroid/88x2bu-20210702;protocol=https;branch=embeddedandroid \
	file://0001-fix-makefile.patch \
"
PV = "5.13.1-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
