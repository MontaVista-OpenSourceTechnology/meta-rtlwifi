SUMMARY = "RTL8814AU kernel driver (wifi)"
DESCRIPTION = "RTL8814ABU kernel driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab842b299d0a92fb908d6eb122cd6de9"

# Track a maintained fork of morrownr/8814au under
# github.com/EmbeddedAndroid. The 'embeddedandroid' branch carries
# fixes for kernel-version guards where upstream gated newer
# cfg80211_ops fields on the wrong KERNEL_VERSION.
SRCREV = "7fc42c645546f5ff13e9fe9ef6d4ec2fa73c998f"
SRC_URI = "git://github.com/EmbeddedAndroid/8814au;protocol=https;branch=embeddedandroid \
           file://0001-Add-make-target-modules_install.patch \
           "
PV = "5.8.5.1-git+2026.05"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
