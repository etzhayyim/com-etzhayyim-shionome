# Shionome WASM core

The maintained component source is the Rust crate in `shionome-core/`.
Its external WIT world is stored at `../wire/wit/world.wit`; published component metadata is an
external projection at `../wire/wasm/shionome-actor.meta.json`.

Legacy Python componentization and shell build wrappers were retired during the standalone west
migration. Build the Rust crate through the workspace resource guard when a component rebuild is
required.
