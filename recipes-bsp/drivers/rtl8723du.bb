SUMMARY = "RTL8723DU kernel driver (wifi)"
DESCRIPTION = "RTL8723DU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

# Track a maintained fork of the (obsolete) lwfinger/rtl8723du driver
# under github.com/EmbeddedAndroid. The 'embeddedandroid' branch carries
# Yocto-specific Makefile glue (modules_install target) and per-kernel
# compile fixes on top of lwfinger's last upstream commit.
SRC_URI = "git://github.com/EmbeddedAndroid/rtl8723du;protocol=https;branch=embeddedandroid"
SRCREV = "cc194aed77dad4547c1d8cc28279fb020434e2a6"
PV = "5.13.4-git+2026.05"

DEPENDS = "virtual/kernel"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
