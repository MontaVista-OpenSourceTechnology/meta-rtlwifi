SUMMARY = "Realtek 802.11n WLAN Adapter Linux driver"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1918d7d89f091725a3188ff95f7c72b"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit module

SRC_URI = " \
    git://github.com/EmbeddedAndroid/8812au-20210820.git;protocol=https;branch=embeddedandroid \
    file://0001-Use-modules_install-as-wanted-by-yocto.patch \
"

# Track an EmbeddedAndroid fork of morrownr/8812au-20210820. The
# 'embeddedandroid' branch starts from upstream commit 9704072d
# (Sep 2025) -- the last good revision before upstream PR #62
# introduced an undefined _FW_UNDER_SURVEY identifier -- and
# carries kernel 6.16/6.17/6.18 compat patches on top.
SRCREV = "93079f26e96d61ec0506ba725c333c41f2b155be"

PV = "5.13.6-git+2026.05"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
